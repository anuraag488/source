package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import java.lang.invoke.VarHandle;
import org.chromium.net.C0995R;

/* JADX INFO: renamed from: ge */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0685ge implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f19750a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f19751b;

    public /* synthetic */ ViewOnAttachStateChangeListenerC0685ge(byte b) {
        this.f19750a = b;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.f19750a) {
            case 0:
                C0722he c0722he = (C0722he) this.f19751b;
                Context context = view.getContext();
                if (!c0722he.f20508c) {
                    context.getApplicationContext().registerComponentCallbacks(c0722he.f20509d);
                    c0722he.f20508c = true;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a24<Object> xr1Var;
        switch (this.f19750a) {
            case 0:
                C0722he c0722he = (C0722he) this.f19751b;
                Context context = view.getContext();
                if (c0722he.f20508c) {
                    context.getApplicationContext().unregisterComponentCallbacks(c0722he.f20509d);
                    c0722he.f20508c = false;
                }
                break;
            case 1:
                AbstractC1091r0 abstractC1091r0 = (AbstractC1091r0) this.f19751b;
                ViewParent parent = abstractC1091r0.getParent();
                hy4 hy4Var = hy4.f20947b;
                if (parent == null) {
                    xr1Var = a81.f162a;
                } else {
                    g32 g32Var = new g32((byte) 23);
                    g32Var.f19558b = parent;
                    VarHandle.storeStoreFence();
                    xr1Var = new xr1(g32Var, hy4Var);
                }
                for (Object obj : xr1Var) {
                    if (obj instanceof View) {
                        Object tag = ((View) obj).getTag(C0995R.id.is_pooling_container_tag);
                        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                        if (bool != null ? bool.booleanValue() : false) {
                            break;
                        }
                    }
                }
                abstractC1091r0.m10171e();
                break;
            default:
                view.removeOnAttachStateChangeListener(this);
                ((t82) this.f19751b).mo4993a(null);
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m5974a(View view) {
    }

    /* JADX INFO: renamed from: b */
    private final void m5975b(View view) {
    }
}
