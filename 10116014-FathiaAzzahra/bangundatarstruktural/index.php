<?php
interface HasilHitungBangunDatar
{
    public function Luas($jari_jari);
    public function Keliling($jari_jari);
}
class lingkaran implements HasilHitungBangunDatar
{
    public function Luas($jari_jari)
    {
        $hasilLuas = 3.14 * $jari_jari * $jari_jari;
        return $hasilLuas;
    }

    public function Keliling($jari_jari)
    {
        $hasilKeliling = 2 * 3.14 * $jari_jari;
        return $hasilKeliling;
    }
}
class HitungIntegrator
{
    private $lingkaran;

    public function __construct()
    {
        $this->lingkaran = new lingkaran();
    }

    public function HasilHitungLingkaran($jari_jari)
    {
        echo 'Hasil luas &nbsp; : ' . $this->lingkaran->Luas($jari_jari) . '<br>';
        echo 'Hasil keliling : ' . $this->lingkaran->Keliling($jari_jari);
    }
}

if ($_SERVER['REQUEST_METHOD'] == 'POST') {
    $jari_jari = $_POST['jari_jari'];
}
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Facade</title>
</head>
<body>
    <form action="#" method="post">
        <p><strong>Jari - Jari Lingkaran</strong></p>
        <div>
            <label for=""> Jari - Jari </label>
            <input type="number" value="<?= isset($jari_jari) ? $jari_jari : '' ?>" name="jari_jari" required>
        </div>
        <p>
            <button type="submit">Hitung</button>
        </p>
    </form>
    <?php 
        if($_SERVER['REQUEST_METHOD'] == 'POST')
        {
            $jari_jari = $_POST['jari_jari'];
            $hi = new HitungIntegrator();
            print_r($hi->HasilHitungLingkaran($jari_jari));
        }
    ?>
</body>
</html>