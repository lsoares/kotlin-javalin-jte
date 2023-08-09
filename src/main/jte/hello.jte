@param Integer guess
@param java.util.List<String> cars

Hello jte!
Time: ${new java.util.Date().toString()}.

<p>
    ${guess} is
    @if(guess % 2 == 0) even @else odd @endif
</p>

<ul>
    @for(String car : cars)
        <li>${car}</li>
    @endfor
</ul>