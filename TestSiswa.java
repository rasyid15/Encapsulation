package pbo_2;

public class TestSiswa {
      public static void main(String[] args) {

    EncapSiswa siswa = new EncapSiswa();
    siswa.setName("agus");
    siswa.setAge(20);
    siswa.setAddress("Malang");
    
        System.out.println(" nama\t: "+siswa.getName()
        + "\n alamat\t:"+siswa.getAddress()
        + "\n berumur:"+siswa.getAge()
        + " tahun");
    }
}
