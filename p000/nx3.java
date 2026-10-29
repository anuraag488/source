package p000;

import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.GestureDescription;
import android.graphics.Path;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class nx3 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public boolean f26176t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ AccessibilityService f26177u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ long f26178v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ long f26179w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nx3(AccessibilityService accessibilityService, long j, long j2, wm0 wm0Var) {
        super(2, wm0Var);
        this.f26177u = accessibilityService;
        this.f26178v = j;
        this.f26179w = j2;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        return new nx3(this.f26177u, this.f26178v, this.f26179w, wm0Var);
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        return ((nx3) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4.f22634a);
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        ap0 ap0Var = ap0.f14763a;
        boolean z = this.f26176t;
        if (z) {
            if (z) {
                k43.m7376J(obj);
                return obj;
            }
            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        k43.m7376J(obj);
        GestureDescription.Builder builder = new GestureDescription.Builder();
        Path path = new Path();
        long j = this.f26178v;
        path.moveTo(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        long j2 = this.f26179w;
        path.lineTo(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
        GestureDescription gestureDescriptionBuild = builder.addStroke(new GestureDescription.StrokeDescription(path, 0L, i41.m6647f(ox3.f27187a))).build();
        this.f26176t = true;
        Object objM13839C = zy5.m13839C(this.f26177u, gestureDescriptionBuild, this);
        return objM13839C == ap0Var ? ap0Var : objM13839C;
    }
}
