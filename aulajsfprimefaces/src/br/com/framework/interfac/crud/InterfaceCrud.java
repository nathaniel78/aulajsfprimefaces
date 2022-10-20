package br.com.framework.interfac.crud;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public interface InterfaceCrud<T> extends Serializable {

	/**
	 * Descrição: salvar objeto
	 * @param obj
	 * @throws Exception
	 */
	void save(T obj) throws Exception;
	
	/**
	 * Descrição: persiste objeto
	 * @param obj
	 * @throws Exception
	 */
	void persist(T obj) throws Exception;
	
	/**
	 * Descrição: salvar e atualizar objeto
	 * @param obj
	 * @throws Exception
	 */
	void saveOrUpdate(T obj) throws Exception;
	
	/**
	 * Descrição: atualizar objeto
	 * @param obj
	 * @throws Exception
	 */
	void update(T obj) throws Exception;
	
	/**
	 * Descrição: excluir objeto
	 * @param obj
	 * @throws Exception
	 */
	void delete(T obj) throws Exception;
	
	/**
	 * Descrição: salvar e atualizar e retorna o objeto
	 * @param obj
	 * @throws Exception
	 */
	void merge(T obj) throws Exception;
	
	/**
	 * Descrição: carrega lista de objetos
	 * @param obj
	 * @return
	 * @throws Exception
	 */
	List<T> findList(Class<T> obj) throws Exception;
	
	/**
	 * Descrição: recupera entidade por id
	 * @param entidade
	 * @param id
	 * @return
	 * @throws Exception
	 */
	Object findById(Class<T> entidade, Long id) throws Exception;
	
	/**
	 * Descrição: recupera entidade por id
	 * @param entidade
	 * @param id
	 * @return
	 * @throws Exception
	 */
	T findByPorId(Class<T> entidade, Long id) throws Exception;
	
	/**
	 * Descrição: carrega lista dinamica
	 * @param s
	 * @return
	 * @throws Exception
	 */
	List<T> ListByQueryDinamica(String s) throws Exception;
	
	/**
	 * Descrição: executa query dinamica HQL
	 * @param s
	 * @throws Exception
	 */
	void executeUpdateQueryDinamica(String s) throws Exception;
	
	/**
	 * Descrição: executa update dinamica SQL
	 * @param s
	 * @throws Exception
	 */
	void executeUpdateSQLDinamica(String s) throws Exception;
	
	/**
	 * Descrição: limpar sessão
	 * @throws Exception
	 */
	void clearSession() throws Exception;
}
