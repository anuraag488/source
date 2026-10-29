package p000;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: jv */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0812jv extends w82 {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ long f22637h = AbstractC1078qo.f28633a.objectFieldOffset(C0812jv.class.getDeclaredField("_disposer$volatile"));
    private volatile /* synthetic */ Object _disposer$volatile;

    /* JADX INFO: renamed from: e */
    public final b70 f22638e;

    /* JADX INFO: renamed from: f */
    public w01 f22639f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C0886lv f22640g;

    public C0812jv(C0886lv c0886lv, b70 b70Var) {
        this.f22640g = c0886lv;
        this.f22638e = b70Var;
    }

    @Override // p000.w82
    /* JADX INFO: renamed from: n */
    public final boolean mo3514n() {
        return false;
    }

    @Override // p000.w82
    /* JADX INFO: renamed from: o */
    public final void mo3515o(Throwable th) {
        b70 b70Var = this.f22638e;
        if (th != null) {
            C0641f8 c0641f8M3482F = b70Var.m3482F(new ff0(th, false), null);
            if (c0641f8M3482F != null) {
                b70Var.mo116s(c0641f8M3482F);
                C0849kv c0849kv = (C0849kv) AbstractC1078qo.f28633a.getObjectVolatile(this, f22637h);
                if (c0849kv != null) {
                    c0849kv.m7632a();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C0886lv.f24381b;
        C0886lv c0886lv = this.f22640g;
        if (atomicIntegerFieldUpdater.decrementAndGet(c0886lv) == 0) {
            hx0[] hx0VarArr = c0886lv.f24382a;
            ArrayList arrayList = new ArrayList(hx0VarArr.length);
            for (hx0 hx0Var : hx0VarArr) {
                arrayList.add(hx0Var.m6528e());
            }
            b70Var.resumeWith(arrayList);
        }
    }
}
