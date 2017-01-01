package db

import (
	"fmt"
	"sync"
)

var (
	r    *repository
	once sync.Once
)

type repository struct {
	items map[string]string
	mu    sync.RWMutex
}

func (r *repository) Set(key, data string) {
	r.mu.Lock()
	defer r.mu.Unlock()
	r.items[key] = data
}

func (r *repository) Get(key string) (string, error) {
	r.mu.Lock()
	defer r.mu.Unlock()
	item, ok := r.items[key]
	if !ok {
		return "", fmt.Errorf("Unable of find key: %s", key)
	}
	return item, nil
}

func Repository() *repository {
	once.Do(func() {
		if r == nil {
			r = &repository{
				items: make(map[string]string),
			}
		}
	})
	return r
}
