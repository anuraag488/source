package p000;

import ads_mobile_sdk.ba4;
import ads_mobile_sdk.f44;
import ads_mobile_sdk.nx2;
import java.util.Locale;
import java.util.Optional;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class d95 extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    public d95(f44 f44Var, nx2 nx2Var, long j) {
        int iM13024d = y70.m13024d(430548174, 1962777121, -1294155075, 737454769) ^ 129967840;
        Locale locale = Locale.US;
        Object[] objArr = new Object[iM13024d];
        objArr[0] = Long.valueOf(f44Var.f3310a);
        objArr[1] = Long.valueOf(nx2Var.f7919a);
        Long lValueOf = Long.valueOf(j);
        objArr[2] = lValueOf;
        super(String.format(locale, ba4.m472a("bk3t6gFTc30="), objArr));
        Optional.of(nx2Var);
        Optional.of(lValueOf);
    }

    public d95(f44 f44Var, Exception exc) {
        super(String.format(Locale.US, ba4.m472a("bk0="), Long.valueOf(f44Var.f3310a)), exc);
        Optional.empty();
        Optional.empty();
    }
}
