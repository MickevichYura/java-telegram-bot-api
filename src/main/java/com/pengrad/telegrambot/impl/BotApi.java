package com.pengrad.telegrambot.impl;

import com.pengrad.telegrambot.model.InputFile;
import com.pengrad.telegrambot.model.InputFileBytes;
import com.pengrad.telegrambot.model.Keyboard;
import com.pengrad.telegrambot.response.GetFileResponse;
import com.pengrad.telegrambot.response.GetMeResponse;
import com.pengrad.telegrambot.response.GetUpdatesResponse;
import com.pengrad.telegrambot.response.GetUserProfilePhotos;
import com.pengrad.telegrambot.response.SendChatActionResponse;
import com.pengrad.telegrambot.response.SendResponse;
import com.pengrad.telegrambot.response.SetWebhookResponse;

import retrofit.Callback;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.Multipart;
import retrofit.http.POST;
import retrofit.http.Part;
import retrofit.http.Query;
import rx.Observable;


/**
 * stas
 * 8/4/15.
 */
public interface BotApi {

    @GET("/getMe")
    GetMeResponse getMe();

    @GET("/getMe")
    void getMe(Callback<GetMeResponse> callback);

    @GET("/getMe")
    Observable<GetMeResponse> getMeRx();


    @POST("/sendMessage")
    @FormUrlEncoded
    SendResponse sendMessage(
            @Field("chat_id") Integer chatId,
            @Field("text") String text,
            @Field("disable_web_page_preview") Boolean disableWebPagePreview,
            @Field("reply_to_message_id") Integer replyToMessageId,
            @Field("reply_markup") Keyboard replyMarkup);

    @POST("/sendMessage")
    @FormUrlEncoded
    SendResponse sendMessage(
            @Field("chat_id") Integer chatId,
            @Field("text") String text,
            @Field("disable_web_page_preview") Boolean disableWebPagePreview,
            @Field("reply_to_message_id") Integer replyToMessageId,
            @Field("reply_markup") Keyboard replyMarkup,
            Callback<SendResponse> callback);

    @POST("/sendMessage")
    @FormUrlEncoded
    Observable<SendResponse> sendMessageRx(
            @Field("chat_id") Integer chatId,
            @Field("text") String text,
            @Field("disable_web_page_preview") Boolean disableWebPagePreview,
            @Field("reply_to_message_id") Integer replyToMessageId,
            @Field("reply_markup") Keyboard replyMarkup);


    @POST("/forwardMessage")
    @FormUrlEncoded
    SendResponse forwardMessage(
            @Field("chat_id") Integer chatId,
            @Field("from_chat_id") Integer fromChatId,
            @Field("message_id") Integer messageId);


    @Multipart
    @POST("/sendPhoto")
    SendResponse sendPhoto(
            @Part("chat_id") Integer chatId,
            @Part("photo") String photo,
            @Part("caption") String caption,
            @Part("reply_to_message_id") Integer replyToMessageId,
            @Part("reply_markup") Keyboard replyMarkup);

    @Multipart
    @POST("/sendPhoto")
    SendResponse sendPhoto(
            @Part("chat_id") Integer chatId,
            @Part("photo") InputFile photo,
            @Part("caption") String caption,
            @Part("reply_to_message_id") Integer replyToMessageId,
            @Part("reply_markup") Keyboard replyMarkup);

    @Multipart
    @POST("/sendPhoto")
    SendResponse sendPhoto(
            @Part("chat_id") Integer chatId,
            @Part("photo") InputFileBytes photo,
            @Part("caption") String caption,
            @Part("reply_to_message_id") Integer replyToMessageId,
            @Part("reply_markup") Keyboard replyMarkup);


    @Multipart
    @POST("/sendAudio")
    SendResponse sendAudio(
            @Part("chat_id") Integer chatId,
            @Part("audio") String audio,
            @Part("duration") Integer duration,
            @Part("reply_to_message_id") Integer replyToMessageId,
            @Part("reply_markup") Keyboard replyMarkup);

    @Multipart
    @POST("/sendAudio")
    SendResponse sendAudio(
            @Part("chat_id") Integer chatId,
            @Part("audio") InputFile audio,
            @Part("duration") Integer duration,
            @Part("reply_to_message_id") Integer replyToMessageId,
            @Part("reply_markup") Keyboard replyMarkup);

    @Multipart
    @POST("/sendAudio")
    SendResponse sendAudio(
            @Part("chat_id") Integer chatId,
            @Part("audio") InputFileBytes audio,
            @Part("duration") Integer duration,
            @Part("reply_to_message_id") Integer replyToMessageId,
            @Part("reply_markup") Keyboard replyMarkup);


    @Multipart
    @POST("/sendDocument")
    SendResponse sendDocument(
            @Part("chat_id") Integer chatId,
            @Part("document") String document,
            @Part("reply_to_message_id") Integer replyToMessageId,
            @Part("reply_markup") Keyboard replyMarkup);

    @Multipart
    @POST("/sendDocument")
    SendResponse sendDocument(
            @Part("chat_id") Integer chatId,
            @Part("document") InputFile document,
            @Part("reply_to_message_id") Integer replyToMessageId,
            @Part("reply_markup") Keyboard replyMarkup);

    @Multipart
    @POST("/sendDocument")
    SendResponse sendDocument(
            @Part("chat_id") Integer chatId,
            @Part("document") InputFileBytes document,
            @Part("reply_to_message_id") Integer replyToMessageId,
            @Part("reply_markup") Keyboard replyMarkup);


    @Multipart
    @POST("/sendSticker")
    SendResponse sendSticker(
            @Part("chat_id") Integer chatId,
            @Part("sticker") String sticker,
            @Part("reply_to_message_id") Integer replyToMessageId,
            @Part("reply_markup") Keyboard replyMarkup);

    @Multipart
    @POST("/sendSticker")
    SendResponse sendSticker(
            @Part("chat_id") Integer chatId,
            @Part("sticker") InputFile sticker,
            @Part("reply_to_message_id") Integer replyToMessageId,
            @Part("reply_markup") Keyboard replyMarkup);

    @Multipart
    @POST("/sendSticker")
    SendResponse sendSticker(
            @Part("chat_id") Integer chatId,
            @Part("sticker") InputFileBytes sticker,
            @Part("reply_to_message_id") Integer replyToMessageId,
            @Part("reply_markup") Keyboard replyMarkup);


    @Multipart
    @POST("/sendVideo")
    SendResponse sendVideo(
            @Part("chat_id") Integer chatId,
            @Part("video") String video,
            @Part("duration") Integer duration,
            @Part("caption") String caption,
            @Part("reply_to_message_id") Integer replyToMessageId,
            @Part("reply_markup") Keyboard replyMarkup);

    @Multipart
    @POST("/sendVideo")
    SendResponse sendVideo(
            @Part("chat_id") Integer chatId,
            @Part("video") InputFile video,
            @Part("duration") Integer duration,
            @Part("caption") String caption,
            @Part("reply_to_message_id") Integer replyToMessageId,
            @Part("reply_markup") Keyboard replyMarkup);

    @Multipart
    @POST("/sendVideo")
    SendResponse sendVideo(
            @Part("chat_id") Integer chatId,
            @Part("video") InputFileBytes video,
            @Part("duration") Integer duration,
            @Part("caption") String caption,
            @Part("reply_to_message_id") Integer replyToMessageId,
            @Part("reply_markup") Keyboard replyMarkup);

    @POST("/sendLocation")
    @FormUrlEncoded
    SendResponse sendLocation(
            @Field("chat_id") Integer chatId,
            @Field("latitude") Float latitude,
            @Field("longitude") Float longitude,
            @Field("reply_to_message_id") Integer replyToMessageId,
            @Field("reply_markup") Keyboard replyMarkup);


    @POST("/sendChatAction")
    @FormUrlEncoded
    SendChatActionResponse sendChatAction(
            @Field("chat_id") Integer chatId,
            @Field("action") String action);


    @GET("/getUserProfilePhotos")
    GetUserProfilePhotos getUserProfilePhotos(
            @Query("user_id") Integer userId,
            @Query("offset") Integer offset,
            @Query("limit") Integer limit);


    @GET("/getUpdates")
    GetUpdatesResponse getUpdates(
            @Query("offset") Integer offset,
            @Query("limit") Integer limit,
            @Query("timeout") Integer timeout);


    @POST("/setWebhook")
    @FormUrlEncoded
    SetWebhookResponse setWebhook(@Field("url") String url);

    @GET("/getFile")
    GetFileResponse getFile(@Query("file_id") String fileId);
}