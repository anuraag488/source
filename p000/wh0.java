package p000;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class wh0 implements ScrollCaptureCallback {

    /* JADX INFO: renamed from: a */
    public i14 f33373a;

    /* JADX INFO: renamed from: b */
    public s52 f33374b;

    /* JADX INFO: renamed from: c */
    public wd3 f33375c;

    /* JADX INFO: renamed from: d */
    public ViewTreeObserverOnGlobalLayoutListenerC1140sc f33376d;

    /* JADX INFO: renamed from: e */
    public um0 f33377e;

    /* JADX INFO: renamed from: f */
    public ex1 f33378f;

    /* JADX WARN: Code duplicated, block: B:34:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: a */
    public final Object m12306a(ScrollCaptureSession scrollCaptureSession, s52 s52Var, ym0 ym0Var) {
        vh0 vh0Var;
        int i;
        int i2;
        ScrollCaptureSession scrollCaptureSession2;
        s52 s52Var2;
        int i3;
        int i4;
        int iM10675p;
        int iM10675p2;
        int i5;
        int i6;
        Canvas canvasLockHardwareCanvas;
        ex1 ex1Var = this.f33378f;
        if (ym0Var instanceof vh0) {
            vh0Var = (vh0) ym0Var;
            int i7 = vh0Var.f32611z;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                vh0Var.f32611z = i7 - Integer.MIN_VALUE;
            } else {
                vh0Var = new vh0(this, ym0Var);
            }
        } else {
            vh0Var = new vh0(this, ym0Var);
        }
        Object obj = vh0Var.f32609x;
        ap0 ap0Var = ap0.f14763a;
        int i8 = vh0Var.f32611z;
        if (i8 == 0) {
            k43.m7376J(obj);
            i = s52Var.f29917b;
            i2 = s52Var.f29919d;
            vh0Var.f32605t = scrollCaptureSession;
            vh0Var.f32606u = s52Var;
            vh0Var.f32607v = i;
            vh0Var.f32608w = i2;
            vh0Var.f32611z = 1;
            if (i > i2) {
                ex1Var.getClass();
                throw new IllegalArgumentException(("Expected min=" + i + " ≤ max=" + i2).toString());
            }
            int i9 = i2 - i;
            int i10 = ex1Var.f18554a;
            if (i9 > i10) {
                C1077qn.m9988n(zi4.m13618r(i9, i10, "Expected range (", ") to be ≤ viewportSize="));
                return null;
            }
            Object objM5419b = ex1Var.m5419b((((i9 / 2) + i) - (i10 / 2)) - ex1Var.f18555b, vh0Var);
            Object obj2 = ju4.f22634a;
            if (objM5419b != ap0Var) {
                objM5419b = obj2;
            }
            if (objM5419b == ap0Var) {
                obj2 = objM5419b;
            }
            if (obj2 != ap0Var) {
            }
            return ap0Var;
        }
        if (i8 == 1) {
            int i11 = vh0Var.f32608w;
            int i12 = vh0Var.f32607v;
            s52 s52Var3 = vh0Var.f32606u;
            ScrollCaptureSession scrollCaptureSession3 = vh0Var.f32605t;
            k43.m7376J(obj);
            i = i12;
            s52Var = s52Var3;
            i2 = i11;
            scrollCaptureSession = scrollCaptureSession3;
        } else {
            if (i8 != 2) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i4 = vh0Var.f32608w;
            i3 = vh0Var.f32607v;
            s52Var2 = vh0Var.f32606u;
            scrollCaptureSession2 = vh0Var.f32605t;
            k43.m7376J(obj);
        }
        float f = ex1Var.f18555b;
        int i13 = ex1Var.f18554a;
        iM10675p = sc6.m10675p(i3 - qq2.m10010E(f), 0, i13);
        iM10675p2 = sc6.m10675p(i4 - qq2.m10010E(ex1Var.f18555b), 0, i13);
        i5 = s52Var2.f29916a;
        i6 = s52Var2.f29918c;
        if (iM10675p == iM10675p2) {
            return s52.f29915e;
        }
        canvasLockHardwareCanvas = scrollCaptureSession2.getSurface().lockHardwareCanvas();
        try {
            canvasLockHardwareCanvas.save();
            canvasLockHardwareCanvas.translate(-i5, -iM10675p);
            s52 s52Var4 = this.f33374b;
            canvasLockHardwareCanvas.translate(-s52Var4.f29916a, -s52Var4.f29917b);
            this.f33376d.getRootView().draw(canvasLockHardwareCanvas);
            int iM10010E = qq2.m10010E(ex1Var.f18555b);
            return new s52(i5, iM10675p + iM10010E, i6, iM10675p2 + iM10010E);
        } finally {
            scrollCaptureSession2.getSurface().unlockCanvasAndPost(canvasLockHardwareCanvas);
        }
        dh0 dh0Var = new dh0((byte) 3);
        vh0Var.f32605t = scrollCaptureSession;
        vh0Var.f32606u = s52Var;
        vh0Var.f32607v = i;
        vh0Var.f32608w = i2;
        vh0Var.f32611z = 2;
        if (C0006a5.m84v(vh0Var.getContext()).mo9530l(dh0Var, vh0Var) != ap0Var) {
            scrollCaptureSession2 = scrollCaptureSession;
            s52Var2 = s52Var;
            i3 = i;
            i4 = i2;
            float f2 = ex1Var.f18555b;
            int i14 = ex1Var.f18554a;
            iM10675p = sc6.m10675p(i3 - qq2.m10010E(f2), 0, i14);
            iM10675p2 = sc6.m10675p(i4 - qq2.m10010E(ex1Var.f18555b), 0, i14);
            i5 = s52Var2.f29916a;
            i6 = s52Var2.f29918c;
            if (iM10675p == iM10675p2) {
                return s52.f29915e;
            }
            canvasLockHardwareCanvas = scrollCaptureSession2.getSurface().lockHardwareCanvas();
            canvasLockHardwareCanvas.save();
            canvasLockHardwareCanvas.translate(-i5, -iM10675p);
            s52 s52Var5 = this.f33374b;
            canvasLockHardwareCanvas.translate(-s52Var5.f29916a, -s52Var5.f29917b);
            this.f33376d.getRootView().draw(canvasLockHardwareCanvas);
            int iM10010E2 = qq2.m10010E(ex1Var.f18555b);
            return new s52(i5, iM10675p + iM10010E2, i6, iM10675p2 + iM10010E2);
        }
        return ap0Var;
    }

    @Override // android.view.ScrollCaptureCallback
    public final void onScrollCaptureEnd(Runnable runnable) {
        lb5.m7910S(this.f33377e, k13.f22815b, null, new C0594e0((Object) this, (Object) runnable, (wm0) null, (byte) 17), 2);
    }

    @Override // android.view.ScrollCaptureCallback
    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        t82 t82VarM7910S = lb5.m7910S(this.f33377e, null, null, new C1031pe((Object) this, (Object) scrollCaptureSession, (Object) rect, (Object) consumer, (wm0) null, (byte) 7), 3);
        C1127s c1127s = new C1127s((byte) 24);
        c1127s.f29778b = cancellationSignal;
        VarHandle.storeStoreFence();
        ((e92) t82VarM7910S).mo4972C(c1127s);
        xh0 xh0Var = new xh0((byte) 0);
        xh0Var.f34278b = t82VarM7910S;
        VarHandle.storeStoreFence();
        cancellationSignal.setOnCancelListener(xh0Var);
    }

    @Override // android.view.ScrollCaptureCallback
    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(gq6.m6070H(this.f33374b));
    }

    @Override // android.view.ScrollCaptureCallback
    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f33378f.f18555b = 0.0f;
        ((d83) this.f33375c.f33259b).setValue(Boolean.TRUE);
        runnable.run();
    }
}
