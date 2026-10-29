package p000;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import essentials.app.EsActivity;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ha1 implements wp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f20457a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ EsActivity f20458b;

    public /* synthetic */ ha1(byte b) {
        this.f20457a = b;
    }

    @Override // p000.wp1
    public final Object invoke() {
        byte b = this.f20457a;
        ju4 ju4Var = ju4.f22634a;
        EsActivity esActivity = this.f20458b;
        switch (b) {
            case 0:
                int i = EsActivity.f18447A;
                int i2 = u61.f31669a;
                r54 r54Var = new r54((byte) 8);
                eg4 eg4Var = new eg4();
                eg4Var.f18077a = 0;
                eg4Var.f18078b = 0;
                eg4Var.f18079c = r54Var;
                VarHandle.storeStoreFence();
                int i3 = u61.f31669a;
                int i4 = u61.f31670b;
                r54 r54Var2 = new r54((byte) 8);
                eg4 eg4Var2 = new eg4();
                eg4Var2.f18077a = i3;
                eg4Var2.f18078b = i4;
                eg4Var2.f18079c = r54Var2;
                VarHandle.storeStoreFence();
                View decorView = esActivity.getWindow().getDecorView();
                y61 z61Var = u61.f31671c;
                if (z61Var == null) {
                    z61Var = Build.VERSION.SDK_INT >= 35 ? new z61() : new y61();
                    u61.f31671c = z61Var;
                }
                s61 s61Var = new s61((byte) 0);
                s61Var.f29932b = z61Var;
                s61Var.f29933c = eg4Var;
                s61Var.f29934d = eg4Var2;
                s61Var.f29935e = esActivity;
                s61Var.f29936f = decorView;
                VarHandle.storeStoreFence();
                ViewGroup viewGroup = (ViewGroup) decorView;
                C1018p1 c1018p1 = new C1018p1((byte) 7);
                c1018p1.f27270c = viewGroup;
                VarHandle.storeStoreFence();
                while (c1018p1.hasNext()) {
                    if (((View) c1018p1.next()).getTag() instanceof v61) {
                        s61Var.run();
                        z61Var.mo12112b(esActivity.getWindow());
                        break;
                    }
                }
                t61 t61Var = new t61(s61Var, viewGroup.getContext());
                t61Var.setTag(z61Var);
                t61Var.setVisibility(8);
                t61Var.setWillNotDraw(true);
                viewGroup.addView(t61Var);
                s61Var.run();
                z61Var.mo12112b(esActivity.getWindow());
                break;
            default:
                int i5 = EsActivity.f18447A;
                esActivity.finish();
                break;
        }
        return ju4Var;
    }
}
