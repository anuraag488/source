package essentials.app;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.ViewGroup;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import p000.C0891m;
import p000.C1077qn;
import p000.C1283w7;
import p000.bg0;
import p000.eo1;
import p000.fi0;
import p000.ga1;
import p000.hj0;
import p000.ir1;
import p000.ja1;
import p000.js1;
import p000.jy4;
import p000.ki0;
import p000.mu3;
import p000.mw3;
import p000.my4;
import p000.nc4;
import p000.ok2;
import p000.ou3;
import p000.pg0;
import p000.qn1;
import p000.r90;
import p000.rl3;
import p000.rn1;
import p000.sn1;
import p000.ui0;
import p000.vf0;
import p000.w71;
import p000.wf0;
import p000.wz4;
import p000.xz4;
import p000.yp1;
import p000.yu3;
import p000.zt1;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class EsActivity extends sn1 {

    /* JADX INFO: renamed from: A */
    public static final /* synthetic */ int f18447A = 0;

    /* JADX INFO: renamed from: essentials.app.EsActivity$a */
    /* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
    public static final class C0624a extends jy4 {

        /* JADX INFO: renamed from: b */
        public final mu3 f18448b = ou3.m9279a(w71.f33134a, new C0891m(9));

        /* JADX INFO: renamed from: c */
        public final mw3 f18449c = new mw3();

        @Override // p000.jy4
        /* JADX INFO: renamed from: b */
        public final void mo5324b() {
            this.f18449c.mo3937a();
        }
    }

    public EsActivity() {
        rn1 rn1Var = new rn1();
        rn1Var.f29434y = this;
        Handler handler = new Handler();
        rn1Var.f29430u = this;
        rn1Var.f29431v = this;
        rn1Var.f29432w = handler;
        rn1Var.f29433x = new eo1();
        VarHandle.storeStoreFence();
        js1 js1Var = new js1();
        js1Var.f22555a = rn1Var;
        VarHandle.storeStoreFence();
        this.f30402v = js1Var;
        byte b = 1;
        this.f30403w = new ok2(this, true);
        this.f30406z = true;
        yu3 yu3Var = (yu3) this.f14450d.f27897c;
        vf0 vf0Var = new vf0((byte) 2);
        vf0Var.f32563b = this;
        VarHandle.storeStoreFence();
        yu3Var.m13255c("android:support:lifecycle", vf0Var);
        qn1 qn1Var = new qn1((byte) 0);
        qn1Var.f28620b = this;
        VarHandle.storeStoreFence();
        m2977d(qn1Var);
        qn1 qn1Var2 = new qn1(b);
        qn1Var2.f28620b = this;
        VarHandle.storeStoreFence();
        this.f14458l.add(qn1Var2);
        wf0 wf0Var = new wf0(b);
        wf0Var.f33286b = this;
        VarHandle.storeStoreFence();
        zt1 zt1Var = this.f14448b;
        if (((Context) zt1Var.f36357b) != null) {
            wf0Var.m12243a();
        }
        ((CopyOnWriteArraySet) zt1Var.f36356a).add(wf0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [ja1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r9v0, types: [ir1, java.lang.Object] */
    /* JADX INFO: renamed from: k */
    public static final void m5323k(ArrayList arrayList, xz4 xz4Var, ir1 ir1Var) {
        ir1Var.m6885d0(19757124);
        int size = arrayList.size();
        byte b = 0;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            wz4 wz4Var = (wz4) obj;
            ir1Var.m6879a0(1831601737, wz4Var);
            pg0 pg0Var = wz4Var.f33881b;
            boolean zM6890g = ir1Var.m6890g(wz4Var) | ir1Var.m6890g(xz4Var);
            ?? M6869O = ir1Var.m6869O();
            if (zM6890g || M6869O == ki0.f23136a) {
                M6869O = new ja1(b);
                M6869O.f22132c = wz4Var;
                M6869O.f22131b = xz4Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(M6869O);
            }
            pg0Var.invoke((yp1) M6869O, ir1Var, 0);
            ir1Var.m6912r(false);
        }
        ir1Var.m6912r(false);
    }

    @Override // p000.sn1, p000.ag0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra("host_id", -1);
        boolean z = this instanceof EsActivityTransparent;
        js1 js1Var = new js1(mo2976c(), (my4) this.f14466t.getValue(), mo2975b());
        r90 r90VarM10361a = rl3.m10361a(C0624a.class);
        C1283w7 c1283w7 = (C1283w7) js1Var.f22555a;
        String strM10248a = r90VarM10361a.m10248a();
        if (strM10248a == null) {
            C1077qn.m9987m("Local and anonymous classes can not be ViewModels");
            return;
        }
        C0624a c0624a = (C0624a) c1283w7.m12122I(r90VarM10361a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strM10248a));
        nc4 nc4Var = hj0.f20619a;
        ui0 ui0Var = (ui0) ((EsApp) getApplicationContext()).f18452b.getValue();
        ga1 ga1Var = new ga1((byte) 0);
        ga1Var.f19686c = this;
        ga1Var.f19687d = intExtra;
        ga1Var.f19688e = c0624a;
        ga1Var.f19685b = z;
        VarHandle.storeStoreFence();
        bg0.m3568a(this, ui0Var, new pg0(-2023163370, true, ga1Var));
        ((fi0) ((ViewGroup) getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0)).m10170d();
    }
}
