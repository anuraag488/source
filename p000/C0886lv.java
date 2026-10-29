package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: lv */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0886lv {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f24381b = AtomicIntegerFieldUpdater.newUpdater(C0886lv.class, "notCompletedCount$volatile");

    /* JADX INFO: renamed from: a */
    public final hx0[] f24382a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    public C0886lv(hx0[] hx0VarArr) {
        this.f24382a = hx0VarArr;
        this.notCompletedCount$volatile = hx0VarArr.length;
    }
}
