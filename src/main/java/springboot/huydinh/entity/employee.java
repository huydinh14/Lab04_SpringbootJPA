package springboot.huydinh.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Table(name = "nhanvien")
@ToString
public class employee {
	
	@Id
    @Column(name = "manv")
    private String MaNV;

    @Column(name = "ten")
    private String Ten;

    @Column(name = "luong")
    private Integer Luong;

    //    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nhanvien")
//    private Collection<ChungNhan> lstChungNhan;

    @Override
    public String toString() {
        return "employee{" +
                "MaNV='" + MaNV + '\'' +
                ", Ten='" + Ten + '\'' +
                ", Luong=" + Luong +
                '}';
    }
}
