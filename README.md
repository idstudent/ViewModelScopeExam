# ViewModelScope

  * viewModelScope는 ViewModel에서 onCleard를 명시하지않아도 자동적으로 onCleard() 호출될때 코루틴작업을 취소함
  * viewModelScope를 사용안하는 경우, onCleard()에서 job.canel()을 써서 취소해야 됨. 그래야 메모리 누수를 막을 수 있음
  
