package p000;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.lang.invoke.VarHandle;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class n05 extends m05 {
    public n05(w05 w05Var, WindowInsets windowInsets) {
        super(w05Var, windowInsets);
    }

    @Override // p000.t05
    /* JADX INFO: renamed from: a */
    public w05 mo8474a() {
        return w05.m12042c(null, this.f23671c.consumeDisplayCutout());
    }

    @Override // p000.l05, p000.t05
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n05)) {
            return false;
        }
        n05 n05Var = (n05) obj;
        return Objects.equals(this.f23671c, n05Var.f23671c) && Objects.equals(this.f23675g, n05Var.f23675g) && l05.m7768K(this.f23676h, n05Var.f23676h);
    }

    @Override // p000.t05
    /* JADX INFO: renamed from: h */
    public m01 mo8475h() {
        DisplayCutout displayCutout = this.f23671c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        m01 m01Var = new m01();
        m01Var.f24510a = displayCutout;
        VarHandle.storeStoreFence();
        return m01Var;
    }

    @Override // p000.t05
    public int hashCode() {
        return this.f23671c.hashCode();
    }

    public n05(w05 w05Var, n05 n05Var) {
        super(w05Var, n05Var);
    }
}
