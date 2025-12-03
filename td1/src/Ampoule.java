class Ampoule {
	boolean allumee;

	Ampoule(){
		allumee = false ;
	}

	boolean estAllumee(){
		return allumee ;
	}

	void allumerAmpoule(){
		allumee = true ;
	}

	void eteindreAmpoule(){
		allumee = false;
	}
}