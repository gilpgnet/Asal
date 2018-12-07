package com.asal;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

/** Controlador del caso de uso. */
public class CtrlSaludo extends Activity {
  private EditText iuNombre1;
  private EditText iuNombre2;
  private TextView iuRespuesta;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.form_saludo);
    iuNombre1 = findViewById(R.id.iuNombre1);
    iuNombre2 = findViewById(R.id.iuNombre2);
    iuRespuesta = findViewById(R.id.iuRespuesta);
  }
  public void saluda(View v) {
    String respuesta;
    try {
      final String nombre1 = iuNombre1.getText().toString().trim();
      final String nombre2 = iuNombre2.getText().toString().trim();
      if (nombre1.isEmpty()) {
        throw new Exception(getString(R.string.falta_el_nombre_1));
      } else if (nombre2.isEmpty()) {
        throw new Exception(getString(R.string.falta_el_nombre_2));
      }
      respuesta = getString(R.string.formato_del_saludo, nombre1, nombre2);
    } catch (Exception e) {
      respuesta = e.getLocalizedMessage();
    }
    iuRespuesta.setText(respuesta);
  }
}