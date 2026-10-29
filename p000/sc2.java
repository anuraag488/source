package p000;

import android.view.KeyEvent;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class sc2 {

    /* JADX INFO: renamed from: a */
    public KeyEvent f30158a;

    public final boolean equals(Object obj) {
        return (obj instanceof sc2) && z62.m13387o(this.f30158a, ((sc2) obj).f30158a);
    }

    public final int hashCode() {
        return this.f30158a.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.f30158a + ")";
    }
}
