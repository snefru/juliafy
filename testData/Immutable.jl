immutable BunchKaufman{T} <: Factorization{T}
    LD::Matrix{T}
    ipiv::Vector{BlasInt}
    uplo::Char
    symmetric::Bool
end