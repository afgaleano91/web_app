package com.example.springbootdocker.service;

import com.example.springbootdocker.model.Father;
import com.example.springbootdocker.model.Mother;
import com.example.springbootdocker.repository.MotherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MotherService implements MotherRepository {

    @Autowired
    private MotherRepository motherRepository;

    @Override
    public List<Mother> findAll() {
        return motherRepository.findAll();
    }

    @Override
    public List<Mother> findAll(Sort sort) {
        return motherRepository.findAll(sort);
    }

    @Override
    public Page<Mother> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Mother> findAllById(Iterable<Long> longs) {
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
    public void delete(Mother entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Mother> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Mother> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Mother> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Mother> findById(Long aLong) {
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
    public <S extends Mother> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Mother> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Mother> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Mother getOne(Long aLong) {
        return null;
    }

    @Override
    public Mother getById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Mother> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Mother> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Mother> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Mother> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Mother> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Mother> boolean exists(Example<S> example) {
        return false;
    }
}
