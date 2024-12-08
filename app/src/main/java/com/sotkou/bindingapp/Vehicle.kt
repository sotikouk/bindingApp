package com.sotkou.bindingapp

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable

class Vehicle: BaseObservable() {
    var modelYear: String = ""

    // Το Bindable Annotation χρησιμοποιείται για properties για τις οποιες
    // η data binding βιβλιοθήκη πρέπει να δημιουργήσει κώδικα για την
    // διαχείρηση των ειδοποιήσεων αλλαγών. Πυροδοτεί αυτόματες ενημερώσεις
    // στο UI το οποίο ειναι δεμένο με αυτή την property.
    @Bindable
    var name: String = ""
        // Πρέπει να τροποποιήσουμε την μέθοδο set γιατι θα χρησιμοποιήσουμε
        // την μέθοδο notifyPropertyChanged()
        set(value) {
            field = value
            notifyPropertyChanged(BR.name) // Ειδοποιεί τους "Ενδιαφερομένους" για την αλλαγή
            // Η BR κλάση δημιουργείται αυτόματα απο το data binding και
            // περιέχει identifiers για κάθε property με @Bindable
        }
}
