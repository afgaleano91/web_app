package com.example.springbootdocker.service;

import com.example.springbootdocker.model.Child;
import com.example.springbootdocker.repository.ChildRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChildService implements ChildRepository{

    @Autowired
    private ChildRepository childRepository;

    @Override
    public List<Child> findAll() {
        return childRepository.findAll();
    }

    @Override
    public List<Child> findAll(Sort sort) {
        return childRepository.findAll(sort);
    }

    @Override
    public Page<Child> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Child> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Child entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Child> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Child> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Child> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Child> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Child> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Child> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Child> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Child getOne(Long aLong) {
        return null;
    }

    @Override
    public Child getById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Child> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Child> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Child> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Child> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Child> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Child> boolean exists(Example<S> example) {
        return false;
    }
}
