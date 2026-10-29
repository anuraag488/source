package p000;

import android.view.autofill.AutofillValue;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lo0 implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f24220a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ mo0 f24221b;

    public /* synthetic */ lo0(byte b) {
        this.f24220a = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f24220a;
        boolean z = false;
        mo0 mo0Var = this.f24221b;
        switch (b) {
            case 0:
                d83 d83Var = mo0Var.f25074s.f31931t;
                Boolean bool = Boolean.TRUE;
                d83Var.setValue(bool);
                mo0Var.f25074s.f31930s.setValue(bool);
                uj2 uj2Var = mo0Var.f25074s;
                AutofillValue autofillValue = ((C1401zd) obj).f35993a;
                mo0.m8365R0(uj2Var, (String) (autofillValue.isText() ? autofillValue.getTextValue() : null), mo0Var.f25075t);
                return bool;
            case 1:
                List list = (List) obj;
                if (mo0Var.f25074s.m11577d() != null) {
                    list.add(mo0Var.f25074s.m11577d().f23216a);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                mo0.m8365R0(mo0Var.f25074s, ((C0875lk) obj).f24092b, mo0Var.f25075t);
                return Boolean.TRUE;
            default:
                C0875lk c0875lk = (C0875lk) obj;
                if (mo0Var.f25075t) {
                    el4 el4Var = mo0Var.f25074s.f31916e;
                    if (el4Var != null) {
                        List listM7694Y = kx5.m7694Y(new zf1(), new xd0(c0875lk, 1));
                        uj2 uj2Var2 = mo0Var.f25074s;
                        nh3 nh3Var = uj2Var2.f31915d;
                        zn0 zn0Var = uj2Var2.f31933v;
                        xk4 xk4VarM8747e = nh3Var.m8747e(listM7694Y);
                        el4Var.m5192a(null, xk4VarM8747e);
                        zn0Var.invoke(xk4VarM8747e);
                    } else {
                        xk4 xk4Var = mo0Var.f25073r;
                        String str = xk4Var.f34341a.f24092b;
                        long j = xk4Var.f34342b;
                        int i = ql4.f28557c;
                        String string = hd4.m6350p0(str, (int) (j >> 32), (int) (j & 4294967295L), c0875lk).toString();
                        int length = c0875lk.f24092b.length() + ((int) (mo0Var.f25073r.f34342b >> 32));
                        mo0Var.f25074s.f31933v.invoke(new xk4(4, sc6.m10657b(length, length), string));
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
