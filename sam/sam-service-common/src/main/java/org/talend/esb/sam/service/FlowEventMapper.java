package org.talend.esb.sam.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class FlowEventMapper implements RowMapper<FlowEvent> {

    @Override
    public FlowEvent mapRow(ResultSet rs, int rowNum) throws SQLException {
        FlowEvent event = new FlowEvent();
        event.setId(String.valueOf(rs.getLong("ID")));
        event.setType(rs.getString("EI_EVENT_TYPE"));
        return event;
    }

}
