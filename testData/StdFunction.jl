function Bidiagonal{T}(dv::AbstractVector{T}, ev::AbstractVector{T}, isupper::Bool)
    length(ev)==length(dv)-1 ? new(dv, ev, isupper) : throw(DimensionMismatch(""))
end