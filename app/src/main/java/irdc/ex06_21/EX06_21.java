package irdc.ex06_21;

import android.app.Activity;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;

public class EX06_21 extends Activity
{
  private TextView TextView01, TextView02, TextView03, TextView04, TextView05;
  private TextView TextView06, TextView07, TextView08, TextView09, TextView10, TextView11;
  private SensorManager mSensorManager;

  /** Called when the activity is first created. */
  @Override
  public void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);

    TextView01 = (TextView) findViewById(R.id.TextView01);
    TextView02 = (TextView) findViewById(R.id.TextView02);
    TextView03 = (TextView) findViewById(R.id.TextView03);
    TextView04 = (TextView) findViewById(R.id.TextView04);
    TextView05 = (TextView) findViewById(R.id.TextView05);
    TextView06 = (TextView) findViewById(R.id.TextView06);
    TextView07 = (TextView) findViewById(R.id.TextView07);
    TextView08 = (TextView) findViewById(R.id.TextView08);    
    TextView09 = (TextView) findViewById(R.id.TextView09);
    TextView10 = (TextView) findViewById(R.id.TextView10);   
    TextView11 = (TextView) findViewById(R.id.TextView11);       
    /* ��oSensorManager */
    mSensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);

  }

  @SuppressWarnings("deprecation")
  @Override
  protected void onResume()
  {
    // TODO Auto-generated method stub
    super.onResume();
    /*SensorEventListener */

    

    mSensorManager.registerListener(mSensorEventListener, mSensorManager
        .getDefaultSensor(Sensor.TYPE_ACCELEROMETER),
        SensorManager.SENSOR_DELAY_NORMAL);

    mSensorManager.registerListener(mSensorEventListener, mSensorManager
        .getDefaultSensor(Sensor.TYPE_MAGNETIC_FIELD),
        SensorManager.SENSOR_DELAY_NORMAL);

    mSensorManager.registerListener(mSensorEventListener, mSensorManager
        .getDefaultSensor(Sensor.TYPE_ORIENTATION),
        SensorManager.SENSOR_DELAY_NORMAL);

    mSensorManager.registerListener(mSensorEventListener, mSensorManager
        .getDefaultSensor(Sensor.TYPE_GYROSCOPE),
        SensorManager.SENSOR_DELAY_NORMAL);

    mSensorManager.registerListener(mSensorEventListener, mSensorManager
        .getDefaultSensor(Sensor.TYPE_LIGHT),
        SensorManager.SENSOR_DELAY_NORMAL);

    mSensorManager.registerListener(mSensorEventListener, mSensorManager
        .getDefaultSensor(Sensor.TYPE_PRESSURE),
        SensorManager.SENSOR_DELAY_NORMAL);

    mSensorManager.registerListener(mSensorEventListener, mSensorManager
        .getDefaultSensor(Sensor.TYPE_TEMPERATURE),
        SensorManager.SENSOR_DELAY_NORMAL);

    mSensorManager.registerListener(mSensorEventListener, mSensorManager
        .getDefaultSensor(Sensor.TYPE_PROXIMITY),
        SensorManager.SENSOR_DELAY_NORMAL);

    mSensorManager.registerListener(mSensorEventListener, mSensorManager
        .getDefaultSensor(Sensor.TYPE_GRAVITY),
        SensorManager.SENSOR_DELAY_NORMAL);
    
    mSensorManager.registerListener(mSensorEventListener, mSensorManager
        .getDefaultSensor(Sensor.TYPE_LINEAR_ACCELERATION),
        SensorManager.SENSOR_DELAY_NORMAL);

    mSensorManager.registerListener(mSensorEventListener, mSensorManager
        .getDefaultSensor(Sensor.TYPE_ROTATION_VECTOR),
        SensorManager.SENSOR_DELAY_NORMAL);    
    
  }

  @Override
  protected void onPause()
  {
    // TODO Auto-generated method stub
    /* ����USensorEventListener */
    mSensorManager.unregisterListener(mSensorEventListener);
    super.onPause();
  }

  private final SensorEventListener mSensorEventListener = new SensorEventListener()
  {

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy)
    {
      // TODO Auto-generated method stub

    }

    @Override
    public void onSensorChanged(SensorEvent event)
    {
      // TODO Auto-generated method stub
      /* �P�_Sensor������ */
 

      if (event.sensor.getType() == Sensor.TYPE_ACCELEROMETER)
      {
        /* TYPE_ACCELEROMETER */
        float x_data = event.values[SensorManager.DATA_X];
         float y_data = event.values[SensorManager.DATA_Y];
          float z_data = event.values[SensorManager.DATA_Z];
        TextView01.setText("TYPE_ACCELEROMETER: \n\r"+String.valueOf(x_data)+"\n\r"+String.valueOf(y_data)+"\n\r"+String.valueOf(z_data)+"\n\r" );
      }
      else if (event.sensor.getType() == Sensor.TYPE_MAGNETIC_FIELD)
      {
        /* TYPE_MAGNETIC_FIELD */
        float x_data = event.values[SensorManager.DATA_X];
         float y_data = event.values[SensorManager.DATA_Y];
          float z_data = event.values[SensorManager.DATA_Z];
        TextView02.setText("TYPE_MAGNETIC_FIELD: \n\r"+String.valueOf(x_data)+"\n\r"+String.valueOf(y_data)+"\n\r"+String.valueOf(z_data)+"\n\r" );
      }      
      else if (event.sensor.getType() == Sensor.TYPE_ORIENTATION)
      {
        /* TYPE_ORIENTATION */
        float x_data = event.values[SensorManager.DATA_X];
        float y_data = event.values[SensorManager.DATA_Y];
        float z_data = event.values[SensorManager.DATA_Z];    
        TextView03.setText("TYPE_ORIENTATION: \n\r"+String.valueOf(x_data)+"\n\r"+String.valueOf(y_data)+"\n\r"+String.valueOf(z_data)+"\n\r" );
      }
      else if (event.sensor.getType() == Sensor.TYPE_GYROSCOPE)
      {
        /* TYPE_GYROSCOPE */
        float x_data = event.values[SensorManager.DATA_X];
         float y_data = event.values[SensorManager.DATA_Y];
          float z_data = event.values[SensorManager.DATA_Z];
        TextView04.setText("TYPE_GYROSCOPE: \n\r"+String.valueOf(x_data)+"\n\r"+String.valueOf(y_data)+"\n\r"+String.valueOf(z_data)+"\n\r" );
      }
      else if (event.sensor.getType() == Sensor.TYPE_LIGHT)
      {
        /* TYPE_LIGHT */
        float x_data = event.values[SensorManager.DATA_X];
         float y_data = event.values[SensorManager.DATA_Y];
          float z_data = event.values[SensorManager.DATA_Z];
        TextView05.setText("TYPE_LIGHT: \n\r"+String.valueOf(x_data)+"\n\r"+String.valueOf(y_data)+"\n\r"+String.valueOf(z_data)+"\n\r" );
      }
      else if (event.sensor.getType() == Sensor.TYPE_PRESSURE)
      {
        /* TYPE_PRESSURE */
        float x_data = event.values[SensorManager.DATA_X];
         float y_data = event.values[SensorManager.DATA_Y];
          float z_data = event.values[SensorManager.DATA_Z];
        TextView06.setText("TYPE_PRESSURE: \n\r"+String.valueOf(x_data)+"\n\r"+String.valueOf(y_data)+"\n\r"+String.valueOf(z_data)+"\n\r" );
      }      
      else if (event.sensor.getType() == Sensor.TYPE_TEMPERATURE)
      {
        /* TYPE_TEMPERATURE */
        float x_data = event.values[SensorManager.DATA_X];
         float y_data = event.values[SensorManager.DATA_Y];
          float z_data = event.values[SensorManager.DATA_Z];
        TextView07.setText("TYPE_TEMPERATURE: \n\r"+String.valueOf(x_data)+"\n\r"+String.valueOf(y_data)+"\n\r"+String.valueOf(z_data)+"\n\r" );
      }
      else if (event.sensor.getType() == Sensor.TYPE_PROXIMITY)
      {
        /* TYPE_PROXIMITY */
        float x_data = event.values[SensorManager.DATA_X];
         float y_data = event.values[SensorManager.DATA_Y];
          float z_data = event.values[SensorManager.DATA_Z];
        TextView08.setText("TYPE_PROXIMITY: \n\r"+String.valueOf(x_data)+"\n\r"+String.valueOf(y_data)+"\n\r"+String.valueOf(z_data)+"\n\r" );
      }
      else if (event.sensor.getType() == Sensor.TYPE_GRAVITY)
      {
        /* TYPE_GRAVITY */
        float x_data = event.values[SensorManager.DATA_X];
         float y_data = event.values[SensorManager.DATA_Y];
          float z_data = event.values[SensorManager.DATA_Z];
        TextView09.setText("TYPE_GRAVITY: \n\r"+String.valueOf(x_data)+"\n\r"+String.valueOf(y_data)+"\n\r"+String.valueOf(z_data)+"\n\r" );
      }
      else if (event.sensor.getType() == Sensor.TYPE_LINEAR_ACCELERATION)
      {
        /* TYPE_LINEAR_ACCELERATION */
        float x_data = event.values[SensorManager.DATA_X];
         float y_data = event.values[SensorManager.DATA_Y];
          float z_data = event.values[SensorManager.DATA_Z];
        TextView10.setText("TYPE_LINEAR_ACCELERATION: \n\r"+String.valueOf(x_data)+"\n\r"+String.valueOf(y_data)+"\n\r"+String.valueOf(z_data)+"\n\r" );
      }      
       else if (event.sensor.getType() == Sensor.TYPE_ROTATION_VECTOR)
      {
        /* TYPE_ROTATION_VECTOR */
        float x_data = event.values[SensorManager.DATA_X];
         float y_data = event.values[SensorManager.DATA_Y];
          float z_data = event.values[SensorManager.DATA_Z];
        TextView11.setText("TYPE_ROTATION_VECTOR: \n\r"+String.valueOf(x_data)+"\n\r"+String.valueOf(y_data)+"\n\r"+String.valueOf(z_data)+"\n\r" );
      }           
    }
  };
}
