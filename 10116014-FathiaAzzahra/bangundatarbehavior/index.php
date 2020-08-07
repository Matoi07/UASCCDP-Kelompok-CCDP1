<?php

abstract class bangundatar
{
    public abstract function luas ();
    public function __toString()
    {
        return $this->getMessage().$this->luas();
    }
    public function getMessage()
    {
        return "Nilai luas adalah  ";
    }
  
}

/**
 * 
 */
class lingkaran extends bangundatar
{
    private $jari_jari;
    public function __construct($jari_jari)
    {
        $this->setJari_jari($jari_jari);
    }

    public function getJari_jari()
    {
        return $this->jari_jari;
    }

    public function setJari_jari($jari_jari)
    {
        $this->jari_jari = $jari_jari;
    }

    public function luas()
    {
        return pi()* $this->getJari_jari()* $this->getJari_jari();
    }
}

class persegi_panjang extends bangundatar
{
    private $lebar;
    private $tinggi;
    public function __construct($lebarVal, $tinggiVal)
    {
        $this->setlebar($lebarVal);
        $this->settinggi($tinggiVal);
    }

    public function getlebar()
    {
        return $this->lebar;
    }

    public function setlebar($lebar)
    {
        $this->lebar = $lebar;
    }

     public function gettinggi()
    {
        return $this->tinggi;
    }

    public function settinggi($tinggi)
    {
        $this->tinggi = $tinggi;
    }

    public function luas()
    {
        return $this->getlebar() * $this->gettinggi();
    }
}

$bentuk = array(new persegi_panjang(4,3), new lingkaran(10), new persegi_panjang(2,10) );

foreach ($bentuk as $objek ) 
{
  echo "<br>".$objek;
}

?>