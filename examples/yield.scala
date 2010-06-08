val noEastCost =
  for (state <- states if state.location != 'east)
    yield state

