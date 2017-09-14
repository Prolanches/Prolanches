/**
 * Este é o pacote responsavel pelas Classes Model 
 */
package br.com.ProjecJava.model;

import java.util.Date;

import br.com.ProjecJava.dto.Contas_PagarDTO;
import br.com.ProjecJava.utils.DateUtils;


/**
 * Esta é a classe responsavel pelo Contas à Pagar para geração de relatórios
 * 
 * @author Noturno
 *
 */
public class Contas_Pagar {
	/**
	 * Este são os atributos de Contas à Pagar
	 */
	private int codigo;
	private double custo;
	private Fornecedor_Suprimento forneSupri;
	private Date data;

	/**
	 * Método de inserção das contas á pagar
	 * @param codigo - para identificar o pacote de dados inseridos
	 * @param custo - custo da nota fiscal
	 * @param forSup - codigo da tabela fornecedor suprimentos
	 * @param data - data da compra
	 */

	public Contas_Pagar(int codigo, double custo, Fornecedor_Suprimento forSup, Date data) {
		super();
		this.codigo = codigo;
		this.custo = custo;
		this.forneSupri = forSup;
		this.data = data;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getCusto() {
		return custo;
	}

	public void setCusto(double custo) {
		this.custo = custo;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Fornecedor_Suprimento getForneSupri() {
		return forneSupri;
	}

	public void setForneSupri(Fornecedor_Suprimento forneSupri) {
		this.forneSupri = forneSupri;
	}
	public Contas_PagarDTO toDTO() {
		return new Contas_PagarDTO(this.getCodigo(), this.getCusto(),this.getForneSupri().getCodigo(),
				DateUtils.formatData(this.getData(), DateUtils.PATTERN_DATA_PADRAO));
	}
}
