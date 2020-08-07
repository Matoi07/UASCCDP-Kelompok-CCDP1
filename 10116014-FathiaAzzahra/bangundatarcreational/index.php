<?php 

//factory
class TrapesiumSembarang
{
    private $sisi_sejajar1;
    private $sisi_sejajar2;
    private $tinggi;

    public function __construct($sejajar1, $sejajar2,$tinggi)
    {
        $this->sisi_sejajar1 = $sejajar1;
        $this->sisi_sejajar2 = $sejajar2;
        $this->tinggi = $tinggi;
    }

    public function luas_trapesium()
    {
        return ($this->sisi_sejajar1 + $this->sisi_sejajar2) *$this->tinggi * 0.5;
    }
}

class TrapesiumSembarangFactory
{
    public static function create($sejajar1, $sejajar2,$tinggi)
    {
        return new TrapesiumSembarang($sejajar1, $sejajar2, $tinggi);
    }
}


if ($_SERVER['REQUEST_METHOD'] == "POST") {
    $sejajar1 = $_POST['sejajar1'];
    $sejajar2 = $_POST['sejajar2'];
    $tinggi = $_POST['tinggi'];

    $trapesium = TrapesiumSembarangFactory::create($sejajar1, $sejajar2,$tinggi);
    $trapesium->luas_trapesium();
}

?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Luas Trapesium Sembarang</title>
</head>
<body>
    <form action="#" method="post">
        <div class="">
            <label for="">Sisi Sejajar 1</label>
            <input   type="number" name="sejajar1" value="<?= isset($sejajar1) ? $sejajar1 : '' ?>" placeholder="Nilai" required>
        </div>
        <br>
        <div class="">
            <label for="">Sisi Sejajar 2</label>
            <input type="number" name="sejajar2" value="<?= isset($sejajar2) ? $sejajar2 : '' ?>" placeholder="Nilai" required>
        </div>
         <br>
        <div class="">
            <label for="">Tinggi        </label>
            <input type="number" name="tinggi" value="<?= isset($tinggi) ? $tinggi : '' ?>" placeholder="Nilai" required>
        </div>
        <br>
        <button type="submit">Hitung</button>
    </form>

    <br>
    
    <?php
    if ($_SERVER['REQUEST_METHOD'] == "POST") {
        echo '<label for="">Hasil</label>';
        echo '<input type="number" value="'. $trapesium->luas_trapesium() .'" readonly>';
    }

    ?>
</body>
</html>