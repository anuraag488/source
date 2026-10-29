package p000;

import java.io.IOException;
import java.util.BitSet;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class qr4 extends uq4 {
    @Override // p000.uq4
    /* JADX INFO: renamed from: b */
    public final Object mo166b(kb2 kb2Var) throws IOException {
        boolean zMo7471C;
        BitSet bitSet = new BitSet();
        kb2Var.mo7490a();
        int iMo7481R = kb2Var.mo7481R();
        int i = 0;
        while (iMo7481R != 2) {
            int iM4376u = d55.m4376u(iMo7481R);
            if (iM4376u == 5 || iM4376u == 6) {
                int iMo7473J = kb2Var.mo7473J();
                if (iMo7473J == 0) {
                    zMo7471C = false;
                } else {
                    if (iMo7473J != 1) {
                        StringBuilder sbM3883o = c75.m3883o("Invalid bitset value ", iMo7473J, ", expected 0 or 1; at path ");
                        sbM3883o.append(kb2Var.mo7500u());
                        throw new lb2(sbM3883o.toString());
                    }
                    zMo7471C = true;
                }
            } else {
                if (iM4376u != 7) {
                    throw new lb2("Invalid bitset value type: " + d55.m4377v(iMo7481R) + "; at path " + kb2Var.mo7498q());
                }
                zMo7471C = kb2Var.mo7471C();
            }
            if (zMo7471C) {
                bitSet.set(i);
            }
            i++;
            iMo7481R = kb2Var.mo7481R();
        }
        kb2Var.mo7495j();
        return bitSet;
    }

    @Override // p000.uq4
    /* JADX INFO: renamed from: c */
    public final void mo167c(yb2 yb2Var, Object obj) throws IOException {
        BitSet bitSet = (BitSet) obj;
        yb2Var.mo12206b();
        int length = bitSet.length();
        for (int i = 0; i < length; i++) {
            yb2Var.mo12199D(bitSet.get(i) ? 1L : 0L);
        }
        yb2Var.mo12208j();
    }
}
