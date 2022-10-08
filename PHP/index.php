<?php
require_once('Car.php');
require_once('Account.php');
require_once("uberX.php");
require_once("uberPool.php");

$uberX = new UberX("FYE660B", new Account("Alan Castor", "CXGA"), "Ford", "Focus");
$uberX->PrintDataCar();

$uberPool = new UberPool("GHS784C", new Account("Dayan bb", "PASS451"), "Nissan", "Tida");
$uberPool->PrintDataCar();
?>