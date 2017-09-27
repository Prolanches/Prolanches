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
	private Integer codigo;
	private double custo;
	private Fornecedor_Suprimento forneSupri;
	private Date data;

	/**
	 * Método de inserção das contas á pagar
	 * 
	 * @param codigo
	 *            - para identificar o pacote de dados inseridos
	 * @param custo
	 *            - custo da nota fiscal
	 * @param forSup
	 *            - codigo da tabela fornecedor suprimentos
	 * @param data
	 *            - data da compra
	 */
	public Contas_Pagar() {

	}

	public Contas_Pagar(Integer codigo, double custo, Fornecedor_Suprimento forSup, Date data) {
		super();
		this.codigo = codigo;
		this.custo = custo;
		this.forneSupri = forSup;
		this.data = data;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
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
		return new Contas_PagarDTO(this.getCodigo(),this.getCusto(),this.getForneSupri().getFornecedor().getNome(), this.getForneSupri().getFornecedor().getCnpj(),
				this.getForneSupri().getFornecedor().getEndereco().getCodigo(),
				this.getForneSupri().getFornecedor().getEndereco().getRua(),
				this.getForneSupri().getFornecedor().getEndereco().getCidade().getCodigo(),
				this.getForneSupri().getFornecedor().getEndereco().getCidade().getNome(),
				this.getForneSupri().getFornecedor().getEndereco().getCidade().getEstado().getCodigo(),
				this.getForneSupri().getFornecedor().getEndereco().getCidade().getEstado().getNome(),
				this.getForneSupri().getFornecedor().getEndereco().getCidade().getEstado().getUf(),
				this.getForneSupri().getFornecedor().getEndereco().getCidade().getEstado().getPais().getCodigo(),
				this.getForneSupri().getFornecedor().getEndereco().getCidade().getEstado().getPais().getNome(),
				this.getForneSupri().getFornecedor().getEndereco().getCidade().getEstado().getPais().getSigla(),
				this.getForneSupri().getFornecedor().getTelefone(),this.getForneSupri().getFornecedor().getEmail(),
				this.getForneSupri().getSuprimento().getCodigo(),this.getForneSupri().getSuprimento().getNome(),
				this.getForneSupri().getSuprimento().getTipoUnidade().getCodigo(),
				this.getForneSupri().getSuprimento().getTipoUnidade().getNome(),
				this.getForneSupri().getSuprimento().getTipoUnidade().getUnidade(),
				this.getForneSupri().getSuprimento().getQuantidade(),0,
				this.getForneSupri().getSuprimento().getCusto(),
				this.getForneSupri().getSuprimento().getMarca().getCodigo(),
				this.getForneSupri().getSuprimento().getMarca().getNome(),
				DateUtils.formatData(this.getData(), DateUtils.PATTERN_DATA_PADRAO));
	}
}
