#pragma config(Motor,  motorA,          m_izquierdo,   tmotorEV3_Large, PIDControl, encoder)
#pragma config(Motor,  motorB,          m_derecho,     tmotorEV3_Large, PIDControl, encoder)

void avanzar(int velocidad, int tiempo) {
	motor[m_izquierdo] = velocidad;
	motor[m_derecho] = velocidad;
	wait1Msec(tiempo);
}

void girar_izquierda(int velocidad_izquierda, int velocidad_derecha, int tiempo) {
	motor[m_izquierdo] = velocidad_izquierda;
	motor[m_derecho] = velocidad_derecha;
	wait1Msec(tiempo);
}

task main()
{
    avanzar(35, 2000);
    girar_izquierda(35, 45, 3000);
    girar_izquierda(50, 0, 200);
    avanzar(40, 2000);
    girar_izquierda(30, 20, 3000);
}
