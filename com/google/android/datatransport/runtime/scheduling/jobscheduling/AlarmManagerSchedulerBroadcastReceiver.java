package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import java.lang.invoke.VarHandle;
import java.util.concurrent.Executor;
import p000.C0588dv;
import p000.RunnableC0484ba;
import p000.bg3;
import p000.jp0;
import p000.kv4;
import p000.mp4;
import p000.wo5;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f16209a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        mp4.m8367b(context);
        jp0 jp0VarM4741a = C0588dv.m4741a();
        jp0VarM4741a.m7225O(queryParameter);
        jp0VarM4741a.f22483d = bg3.m3589b(iIntValue);
        if (queryParameter2 != null) {
            jp0VarM4741a.f22481b = Base64.decode(queryParameter2, 0);
        }
        wo5 wo5Var = mp4.m8366a().f25118d;
        C0588dv c0588dvM7241j = jp0VarM4741a.m7241j();
        RunnableC0484ba runnableC0484ba = new RunnableC0484ba((byte) 0);
        Executor executor = (Executor) wo5Var.f33570e;
        kv4 kv4Var = new kv4();
        kv4Var.f23544a = wo5Var;
        kv4Var.f23545b = c0588dvM7241j;
        kv4Var.f23546c = i;
        kv4Var.f23547d = runnableC0484ba;
        VarHandle.storeStoreFence();
        executor.execute(kv4Var);
    }
}
