package springboot.huydinh.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Data
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@Table(name = "chungnhan")
@ToString
public class certification implements Serializable{
	
	 	@Id
	    @JoinColumn(name = "MaNV", referencedColumnName = "MaNV", insertable = false, updatable = false)
	    @ManyToOne(optional = false)
	    private employee nhanVien;

	    @Id
	    @JoinColumn(name = "MaMB",referencedColumnName = "MaMB", insertable = false, updatable = false)
	    @ManyToOne(optional = false)
	    private plane mayBay;
	
}
