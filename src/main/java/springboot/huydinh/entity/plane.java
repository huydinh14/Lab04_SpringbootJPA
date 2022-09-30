package springboot.huydinh.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Table(name = "maybay")
@ToString
public class plane{
	
	@Id
    @Column(name = "mamb")
    private int MaMB;

    @Column(name = "loai")
    private String Loai;

    @Column(name = "tambay")
    private int TamBay;

    @Override
    public String toString() {
        return "plane{" +
                "MaMB=" + MaMB +
                ", Loai='" + Loai + '\'' +
                ", TamBay=" + TamBay +
                '}';
    }
}
