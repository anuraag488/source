package p000;

import ads_mobile_sdk.C0079d3;
import ads_mobile_sdk.ff3;
import ads_mobile_sdk.sy3;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import java.lang.invoke.VarHandle;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class w72 extends Binder implements nz1 {

    /* JADX INFO: renamed from: a */
    public final Executor f33135a;

    /* JADX INFO: renamed from: b */
    public final C1163sz f33136b;

    public w72(Executor executor, C1163sz c1163sz) {
        attachInterface(this, nz1.f26221fp);
        this.f33135a = executor;
        this.f33136b = c1163sz;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = nz1.f26221fp;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i == 16777215) {
            parcel2.writeNoException();
            parcel2.writeInt(1);
            return true;
        }
        Executor executor = this.f33135a;
        if (i == 1) {
            parcel.readInt();
            final int i3 = parcel.readInt();
            final String string = parcel.readString();
            final String string2 = parcel.readString();
            final int i4 = parcel.readInt();
            final int i5 = parcel.readInt();
            final String string3 = parcel.readString();
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                try {
                    executor.execute(new Runnable(i3, string, string2, i4, i5, string3) { // from class: v72

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ int f32441b;

                        /* JADX INFO: renamed from: c */
                        public final /* synthetic */ String f32442c;

                        /* JADX INFO: renamed from: d */
                        public final /* synthetic */ String f32443d;

                        /* JADX INFO: renamed from: e */
                        public final /* synthetic */ int f32444e;

                        /* JADX INFO: renamed from: f */
                        public final /* synthetic */ int f32445f;

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i6 = this.f32441b;
                            if ((i6 & 31) == 0 || ((i6 - 1) & i6) != 0) {
                                C1077qn.m9987m(c75.m3878j("invalid console level ", i6, " provided by isolate"));
                                return;
                            }
                            String str2 = this.f32442c;
                            Objects.requireNonNull(str2);
                            String str3 = this.f32443d;
                            Objects.requireNonNull(str3);
                            C1163sz c1163sz = this.f32440a.f33136b;
                            f82 f82Var = new f82();
                            f82Var.f18836a = i6;
                            f82Var.f18837b = str2;
                            f82Var.f18838c = str3;
                            f82Var.f18839d = this.f32444e;
                            f82Var.f18840e = this.f32445f;
                            VarHandle.storeStoreFence();
                            ff3 ff3Var = (ff3) c1163sz.f30676b;
                            sy3.m2303a(ff3Var.f3480h, (t82) null, new C0079d3((Object) ff3Var, (Object) f82Var, c1163sz.f30677c, (wm0) null, (byte) 25), 3);
                        }
                    });
                } catch (Throwable th) {
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                    throw th;
                }
            } catch (RejectedExecutionException e) {
                Log.e("IsolateUsableState", "Console message dropped", e);
            }
            Binder.restoreCallingIdentity(jClearCallingIdentity);
            parcel2.writeNoException();
        } else {
            if (i != 2) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.readInt();
            long jClearCallingIdentity2 = Binder.clearCallingIdentity();
            try {
                try {
                    C1163sz c1163sz = this.f33136b;
                    Objects.requireNonNull(c1163sz);
                    RunnableC1054q0 runnableC1054q0 = new RunnableC1054q0((byte) 9);
                    runnableC1054q0.f28115b = c1163sz;
                    VarHandle.storeStoreFence();
                    executor.execute(runnableC1054q0);
                } catch (Throwable th2) {
                    Binder.restoreCallingIdentity(jClearCallingIdentity2);
                    throw th2;
                }
            } catch (RejectedExecutionException e2) {
                Log.e("IsolateUsableState", "Console clear dropped", e2);
            }
            Binder.restoreCallingIdentity(jClearCallingIdentity2);
            parcel2.writeNoException();
        }
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
