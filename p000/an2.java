package p000;

import android.os.LocaleList;
import java.lang.invoke.VarHandle;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class an2 {

    /* JADX INFO: renamed from: a */
    public bn2 f14639a;

    static {
        m3052a(new LocaleList(new Locale[0]));
    }

    /* JADX INFO: renamed from: a */
    public static an2 m3052a(LocaleList localeList) {
        bn2 bn2Var = new bn2();
        bn2Var.f15435a = localeList;
        VarHandle.storeStoreFence();
        an2 an2Var = new an2();
        an2Var.f14639a = bn2Var;
        VarHandle.storeStoreFence();
        return an2Var;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof an2) && this.f14639a.equals(((an2) obj).f14639a);
    }

    public final int hashCode() {
        return this.f14639a.f15435a.hashCode();
    }

    public final String toString() {
        return this.f14639a.f15435a.toString();
    }
}
