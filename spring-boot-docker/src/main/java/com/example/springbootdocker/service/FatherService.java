package com.example.springbootdocker.service;

import com.example.springbootdocker.model.Father;
import com.example.springbootdocker.repository.FatherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FatherService implements FatherRepository {

    @Autowired
    private FatherRepository fatherRepository;

    @Override
    public List<Father> findAll() {
        return fatherRepository.findAll();
    }

    @Override
    public List<Father> findAll(Sort sort) {
        return fatherRepository.findAll(sort);
    }

    @Override
    public Page<Father> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Father> findAllById(Iterable<Long> longs) {
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
    public void delete(Father entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Father> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Father> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Father> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Father> findById(Long aLong) {
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
    public <S extends Father> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Father> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Father> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Father getOne(Long aLong) {
        return null;
    }

    @Override
    public Father getById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Father> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Father> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Father> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Father> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Father> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Father> boolean exists(Example<S> example) {
        return false;
    }
}
