package com.aviva.avivasucre;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.Resources;
import android.nfc.Tag;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.transition.Visibility;
import android.util.Log;
import android.view.View;

import com.bumptech.glide.load.engine.Resource;
import com.github.clans.fab.FloatingActionMenu;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    LatLng MSurapata = new LatLng(-19.042432, -65.258052),
     LSucre = new LatLng(-19.0464292,-65.2526743),
     LSantaB = new LatLng(-19.044808, -65.263424),
     LSUni = new LatLng( -19.049010, -65.265912),
    LCristoAmericas = new LatLng(-19.045027, -65.268705),
    LMJesusP = new LatLng(-19.050883, -65.255344),
    LGinecoObs = new LatLng(-19.045305, -65.268384),
    LSanCris = new LatLng(-19.045667, -65.261654),
    LIPTK = new LatLng(-19.045474, -65.257709),
    LCajaPetro = new LatLng(-19.037254, -65.259729),
    LCossmil = new LatLng(-19.044065, -65.253185),
    LLosAng = new LatLng(-19.055562, -65.265421),
    LBancaP = new LatLng(-19.051228, -65.260481),
    LCies = new LatLng(-19.041816, -65.262185),
    LCKausay = new LatLng(-19.033085, -65.253181),
    LMedicor = new LatLng(-19.043733, -65.263760),
    LHUniv = new LatLng(-19.028352, -65.257039),
    LCruzR = new LatLng(-19.049384, -65.248319),
    LCiesU = new LatLng(-19.050358, -65.250820),
    LSCies =  new LatLng(-19.049820, -65.246129),
    LClinicaA = new LatLng(-19.045939, -65.267599),
    LGastro = new LatLng(-19.045733, -65.268157);
    FloatingActionMenu actionMenu;

    Marker SantaB, Surapata, SUni, MJesusP, CristoAmericas, ClinicaA,
            GinecoObs, SanCris, IPTK, CajaPetro, Cossmil, LosAng, BancaP, Cies, CKausay, Medicor, HUniv, CruzR, CiesU, SCies, Gastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_layout);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.

        actionMenu=(FloatingActionMenu) findViewById(R.id.fmenu);
        actionMenu.setClosedOnTouchOutside(true);

        int status = GooglePlayServicesUtil.isGooglePlayServicesAvailable(getApplicationContext());
        if (status== ConnectionResult.SUCCESS) {
            SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                    .findFragmentById(R.id.map);
            mapFragment.getMapAsync(this);
        }else{
            Dialog dialog=GooglePlayServicesUtil.getErrorDialog(status,(Activity)getApplicationContext(),10);
            dialog.show();
        }
    }
    public void ClickMenu1(View view){
        SantaB.setVisible(true);
        SUni.setVisible(true);
        MJesusP.setVisible(true);
        CristoAmericas.setVisible(true);
        ClinicaA.setVisible(true);
        GinecoObs.setVisible(true);
        SanCris.setVisible(true);
        IPTK.setVisible(true);
        CajaPetro.setVisible(true);
        Cossmil.setVisible(true);
        LosAng.setVisible(true);
        BancaP.setVisible(true);
        Cies.setVisible(true);
        CKausay.setVisible(true);
        Medicor.setVisible(true);
        HUniv.setVisible(true);
        CruzR.setVisible(true);
        CiesU.setVisible(true);
        SCies.setVisible(true);
        Gastro.setVisible(true);


        Surapata.setVisible(false);
    }
    public void ClickMenu2(View view){

        SantaB.setVisible(false);
        SUni.setVisible(false);
        MJesusP.setVisible(false);
        CristoAmericas.setVisible(false);
        ClinicaA.setVisible(false);
        GinecoObs.setVisible(false);
        SanCris.setVisible(false);
        IPTK.setVisible(false);
        CajaPetro.setVisible(false);
        Cossmil.setVisible(false);
        LosAng.setVisible(false);
        BancaP.setVisible(false);
        Cies.setVisible(false);
        CKausay.setVisible(false);
        Medicor.setVisible(false);
        HUniv.setVisible(false);
        CruzR.setVisible(false);
        CiesU.setVisible(false);
        SCies.setVisible(false);
        Gastro.setVisible(false);

        Surapata.setVisible(true);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        // Add a marker in Sydney and move the camera -19.053620, -65.262147

        SantaB=mMap.addMarker(new MarkerOptions().position(LSantaB).title("Santa Barbara").icon(BitmapDescriptorFactory.fromResource(R.drawable.hospital_5)));
        SUni=mMap.addMarker(new MarkerOptions().position(LSUni).title("Seguro Universitario"));
        Surapata=mMap.addMarker(new MarkerOptions().position(MSurapata).title("Modulo Surapata"));
        MJesusP = mMap.addMarker(new MarkerOptions().position(LMJesusP).title("Hospital Monseñor Jesus Perez"));
        CristoAmericas = mMap.addMarker(new MarkerOptions().position(LCristoAmericas).title("Cristo de las Americas"));
        ClinicaA = mMap.addMarker(new MarkerOptions().position(LClinicaA).title("Clínica Angeles"));
        GinecoObs = mMap.addMarker(new MarkerOptions().position(LGinecoObs).title("Hospital Gineco Obstétrico"));
        SanCris = mMap.addMarker(new MarkerOptions().position(LSanCris).title("Hospital San Cristobal"));
        IPTK = mMap.addMarker(new MarkerOptions().position(LIPTK).title("Hospital Popular IPTK"));
        CajaPetro = mMap.addMarker(new MarkerOptions().position(LCajaPetro).title("Caja Petrolera de Salud"));
        Cossmil = mMap.addMarker(new MarkerOptions().position(LCossmil).title("Hospital Cossmil"));
        LosAng = mMap.addMarker(new MarkerOptions().position(LLosAng).title("Hospital los Angeles"));
        BancaP = mMap.addMarker(new MarkerOptions().position(LBancaP).title("Caja de Salud de la Banca Privada"));
        Cies = mMap.addMarker(new MarkerOptions().position(LCies).title("CIES"));
        CKausay = mMap.addMarker(new MarkerOptions().position(LCKausay).title("Clinicade Salud Integral Kawsay Pujyu"));
        Medicor = mMap.addMarker(new MarkerOptions().position(LMedicor).title("Medicor"));
        HUniv = mMap.addMarker(new MarkerOptions().position(LHUniv).title("Hospital Universitario"));
        CruzR = mMap.addMarker(new MarkerOptions().position(LCruzR).title("Cruz Roja"));
        CiesU = mMap.addMarker(new MarkerOptions().position(LCiesU).title("CIES Umosas Sucre"));
        SCies = mMap.addMarker(new MarkerOptions().position(LSCies).title("Sucursal CIES San Antonio"));
        Gastro = mMap.addMarker(new MarkerOptions().position(LGastro).title("Hospital Gastroenterológico Boliviano-Japonés"));
        float zoom=13;

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(LSucre,zoom));


    }
}