package edu.formation.interfaces;

import java.util.List;

/**
 * @author Seme
 *
 */
public interface IDataRecovery<T> {
  public List<T> findAll();

  public T findById(Long id);
}
