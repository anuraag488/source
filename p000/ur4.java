package p000;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class ur4 extends uq4 {
    @Override // p000.uq4
    /* JADX INFO: renamed from: b */
    public final Object mo166b(kb2 kb2Var) throws IOException {
        if (kb2Var.mo7481R() == 9) {
            kb2Var.mo7477N();
            return null;
        }
        try {
            int iMo7473J = kb2Var.mo7473J();
            if (iMo7473J <= 255 && iMo7473J >= -128) {
                return Byte.valueOf((byte) iMo7473J);
            }
            StringBuilder sbM3883o = c75.m3883o("Lossy conversion from ", iMo7473J, " to byte; at path ");
            sbM3883o.append(kb2Var.mo7500u());
            throw new lb2(sbM3883o.toString());
        } catch (NumberFormatException e) {
            throw new lb2(e);
        }
    }

    @Override // p000.uq4
    /* JADX INFO: renamed from: c */
    public final void mo167c(yb2 yb2Var, Object obj) throws IOException {
        Number number = (Number) obj;
        if (number == null) {
            yb2Var.mo12211t();
        } else {
            yb2Var.mo12199D(number.byteValue());
        }
    }
}
