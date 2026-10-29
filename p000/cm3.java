package p000;

import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class cm3 implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Pattern f16127a;

    public cm3(String str) {
        this.f16127a = Pattern.compile(str);
    }

    /* JADX INFO: renamed from: a */
    public static C1283w7 m4045a(cm3 cm3Var, String str) {
        return i20.m6596u(cm3Var.f16127a.matcher(str), 0, str);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m4046b(CharSequence charSequence) {
        return this.f16127a.matcher(charSequence).matches();
    }

    public final String toString() {
        return this.f16127a.toString();
    }
}
