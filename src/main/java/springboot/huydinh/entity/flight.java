package springboot.huydinh.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Time;

@Entity
@Data
@Table(name = "chuyenbay")
public class flight{
	@Id
	@Column(name = "macb", unique = true)
	private String MaCB;

	@Column(name = "gadi")
	private String GaDi;

	@Column(name = "gaden")
	private String GaDen;

	@Column(name = "dodai")
	private int DoDai;

	@Column(name = "giodi")
	private Time GioDi;

	@Column(name = "gioden")
	private Time GioDen;

	@Column(name = "chiphi")
	private int ChiPhi;

	@Override
	public String toString() {
		return "flight [MaCB=" + MaCB + ", GaDi=" + GaDi + ", GaDen=" + GaDen + ", DoDai=" + DoDai + ", GioDi=" + GioDi
				+ ", GioDen=" + GioDen + ", ChiPhi=" + ChiPhi + "]";
	}
	
}