@param x.Car car
@param Integer guess
@param java.util.List<String> fruits

Hello jte!
Time: ${new java.util.Date().toString()}.

<p>${guess} is @if(guess % 2 == 0) even @else odd @endif</p>

<ul>
    @for(String fruit : fruits)
        <li>${fruit}</li>
    @endfor
</ul>

<p>@template.components.carCard(car = car)</p>