package com.expense.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.expense.mvc.model.Expense;


@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long>{

}
