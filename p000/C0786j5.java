package p000;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import java.lang.invoke.VarHandle;
import java.util.List;

/* JADX INFO: renamed from: j5 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0786j5 implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f22018a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f22019b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f22020c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f22021d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f22022e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f22023f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f22024g;

    public /* synthetic */ C0786j5(byte b) {
        this.f22018a = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f22018a;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                zo0 zo0Var = (zo0) this.f22019b;
                C0861l6 c0861l6 = (C0861l6) this.f22020c;
                String str = (String) this.f22021d;
                C0516c6 c0516c6 = (C0516c6) this.f22022e;
                sw2 sw2Var = (sw2) this.f22023f;
                xn2 xn2Var = (xn2) this.f22024g;
                C1060q6 c1060q6 = new C1060q6((Context) obj);
                lb5.m7910S(zo0Var, null, null, new C0934n5(c0861l6, c1060q6, str, c0516c6, sw2Var, xn2Var, null, (byte) 0), 3);
                return c1060q6;
            case 1:
                db3[] db3VarArr = (db3[]) this.f22019b;
                List list = (List) this.f22020c;
                zq2 zq2Var = (zq2) this.f22021d;
                ol3 ol3Var = (ol3) this.f22022e;
                ol3 ol3Var2 = (ol3) this.f22023f;
                s20 s20Var = (s20) this.f22024g;
                cb3 cb3Var = (cb3) obj;
                int length = db3VarArr.length;
                int i = 0;
                int i2 = 0;
                while (i2 < length) {
                    q20.m9705d(cb3Var, db3VarArr[i2], (sq2) list.get(i), zq2Var.getLayoutDirection(), ol3Var.f26851a, ol3Var2.f26851a, s20Var.f29826a);
                    i2++;
                    i++;
                }
                return ju4Var;
            default:
                View view = (View) this.f22019b;
                zg4 zg4Var = (zg4) this.f22020c;
                vg4 vg4Var = (vg4) this.f22021d;
                WindowManager windowManager = (WindowManager) this.f22022e;
                C0950nl c0950nl = (C0950nl) this.f22024g;
                sw2 sw2Var2 = (sw2) this.f22023f;
                aa4 aa4Var = new aa4(new r54((byte) 10));
                ql3 ql3Var = new ql3();
                sg4 sg4Var = new sg4();
                sg4Var.f30253a = aa4Var;
                sg4Var.f30254b = ql3Var;
                sg4Var.f30255c = view;
                sg4Var.f30256d = zg4Var;
                sg4Var.f30257e = vg4Var;
                sg4Var.f30258f = windowManager;
                sg4Var.f30259g = c0950nl;
                sg4Var.f30260h = sw2Var2;
                VarHandle.storeStoreFence();
                ql3Var.f28555a = sg4Var;
                aa4Var.m160f();
                Object obj2 = ql3Var.f28555a;
                if (obj2 == null) {
                    z62.m13366Y("update");
                    throw null;
                }
                ((yp1) obj2).invoke(ju4Var);
                C1032pf c1032pf = new C1032pf((byte) 13);
                c1032pf.f27570b = aa4Var;
                VarHandle.storeStoreFence();
                return c1032pf;
        }
    }
}
