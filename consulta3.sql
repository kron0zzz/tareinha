select idEstudiante, identificacion, nombres, apellidos, edad from Estudiantes e where activo= "N" and edad >= 18 and identificacion like '1%' order by nombres;
