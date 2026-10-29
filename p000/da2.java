package p000;

import android.graphics.PathMeasure;
import java.lang.invoke.VarHandle;
import java.util.Collections;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class da2 implements wp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f16883a;

    public /* synthetic */ da2(byte b) {
        this.f16883a = b;
    }

    @Override // p000.wp1
    public final Object invoke() {
        byte b = this.f16883a;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                return oa2.f26498b;
            case 1:
                return ya2.f35071b;
            case 2:
                return q92.f28322b;
            case 3:
                return new wf2(3);
            case 4:
                return new si2(0, 0);
            case 5:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case 6:
                throw new IllegalStateException("Unexpected access to LocalNavAnimatedContentScope. You should only access LocalNavAnimatedContentScope inside a NavEntry passed to NavDisplay. AnimatedContentScope in OverlayScenes are no-op.");
            case 7:
                return null;
            case 8:
                nc4 nc4Var = wm2.f33489a;
                return ia5.f21222m;
            case 9:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case 10:
                return null;
            case 11:
                return new wf2(2);
            case 12:
                return Boolean.FALSE;
            case 13:
                return new lq2(ic0.m6746f(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 65535), new js4(), new s44(), ku2.f23518a);
            case 14:
                return null;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                return ju4Var;
            case 20:
                um0 um0VarM13670b = zp0.m13670b(r71.f29063a);
                zp0.m13682n(um0VarM13670b, null);
                return um0VarM13670b;
            case 21:
                long jM13870e = zy5.m13870e(4284900966L);
                g73 g73VarM5669g = AbstractC0647fd.m5669g(0.0f, 3);
                l63 l63Var = new l63();
                l63Var.f23818a = jM13870e;
                l63Var.f23819b = g73VarM5669g;
                VarHandle.storeStoreFence();
                return l63Var;
            case 22:
                PathMeasure pathMeasure = new PathMeasure();
                C0525cf c0525cf = new C0525cf();
                c0525cf.f15974a = pathMeasure;
                VarHandle.storeStoreFence();
                return c0525cf;
            case 23:
                return Collections.singletonList(new kr3(vd6.f32540c));
            case 24:
                return null;
            case 25:
                pw0 pw0Var = l01.f23664a;
                return gw0.f20149b;
            case 26:
                return null;
            case 27:
                return ze3.f36023b;
            case 28:
                return sj3.f30334d;
            default:
                return new iu3(new LinkedHashMap());
        }
    }
}
