package p000;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ym2 {

    /* JADX INFO: renamed from: a */
    public final Locale f35328a;

    public ym2(Locale locale) {
        this.f35328a = locale;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ym2)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return z62.m13387o(this.f35328a.toLanguageTag(), ((ym2) obj).f35328a.toLanguageTag());
    }

    public final int hashCode() {
        return this.f35328a.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.f35328a.toLanguageTag();
    }
}
