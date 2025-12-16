package com.CarproSaas.myfirstproject.controller;

import com.CarproSaas.myfirstproject.entity.JournalEntity;

import java.util.List;

public interface IjournalService {

List<JournalEntity> GetAllRecords();

JournalEntity GetRecordById(int id);

JournalEntity addRecords(JournalEntity journalEntity);

String DeleteRecord(int id);

JournalEntity UpdateRecords(int id ,JournalEntity journalEntity);
}
