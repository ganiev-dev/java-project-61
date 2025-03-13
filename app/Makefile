run-dist: # запустить приложение
	@gradle installDist
	@./build/install/app/bin/app

lint:
	gradle checkstyleMain

report:
	gradle jacocoTestReport
